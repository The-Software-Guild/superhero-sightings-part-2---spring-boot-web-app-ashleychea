package dao;

import models.Hero;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class HeroesDaoDB  implements HeroesDao {

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public Hero getHeroesByID(int heroID) {

        return null;
    }

    @Override
    public List<Hero> getAllHeroes() {
        return null;
    }

    @Override
    public Hero addHeroes(Hero hero) {
        return null;
    }

    @Override
    public void updateHeroes(Hero hero) {

    }

    @Override
    public void deleteHeroesByID(int ID) {

    }
}
