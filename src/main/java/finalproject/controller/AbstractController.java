
package finalproject.controller;

import finalproject.util.BookException;
import finalproject.util.HibernateUtil;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.hibernate.Session;

public abstract class AbstractController <T> {
    
    protected T entity;
    protected Session session;
    protected Validator validator;
    
    public abstract List<T> getData();
    protected abstract void controlCreate() throws BookException;
    protected abstract void controlUpdate() throws BookException;
    protected abstract void controlDelete() throws BookException;
        
    public AbstractController() {
        this.session = HibernateUtil.getSession();
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
    
    public AbstractController(T entity) {
        this();
        this.entity = entity;
    }
    
    public T create() throws BookException {
        validate();
        controlCreate();
        save();
        return this.entity;
    }
    
    public T update() throws BookException {
        validate();
        controlUpdate();
        save();
        return this.entity;
    }
    
    public boolean delete() throws BookException {
        controlDelete();
        session.beginTransaction();
        session.delete(this.entity);
        session.getTransaction().commit();
        return true;
    }
    
    private void save() {
        session.beginTransaction();
        session.save(this.entity);
        session.getTransaction().commit();
    }
    
    private void validate() throws BookException {       
         Set<ConstraintViolation<T>> constraintViolations = validator.validate(this.entity);
         
         if (constraintViolations.size() > 0) {         
            StringBuilder sb = new StringBuilder();
            for (ConstraintViolation<T> violation : constraintViolations) {
                sb.append(violation.getMessage());
                sb.append(", ");
            }
            
            throw new BookException(sb.toString());
         }     
    }
    
    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

}