package db;

import models.Basket;
import models.Product;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DBTest {
    private static Session session;

    public static List<Product> findAllProductsOfThis(Basket basket){   djnfdjsfsdjndsf try{

            Criteria cr = session.createCriteria(Product.class);
            cr.add(Restrictions.eq("id", basket.getId()));
            result =  cr.list();
//            cr.addOrder(Order.desc("id"));
        }
        catch (HibernateException ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }

        return result;

    }
}
