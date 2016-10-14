package repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateCallback;

import model.Player;

@SuppressWarnings("serial")
public class PlayerRepository extends HibernateGenericDAO<Player> implements GenericRepository<Player> {

    //private static final long serialVersionUID = -4036535812105672110L;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Player> filterPeople(final String pattern) {
        return (List<Player>) this.getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public List<Player> doInHibernate(final Session session) throws HibernateException {
                Criteria criteria = session.createCriteria(Player.class);
                criteria.add(Restrictions.like("name", "%" + pattern + "%"));
                return criteria.list();
            }

        });
    }

    @Override
    protected Class<Player> getDomainClass() {
        return Player.class;
    }
}

