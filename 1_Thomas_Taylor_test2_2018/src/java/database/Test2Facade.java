/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 14034305
 */
@Stateless
public class Test2Facade extends AbstractFacade<Test2> {

    @PersistenceContext(unitName = "1_Thomas_Taylor_test2_2018PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Test2Facade() {
        super(Test2.class);
    }
    
}
