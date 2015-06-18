/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reservas;

import com.ncc.reservas.Tipohabitacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author administrador
 */
@Stateless
public class TipohabitacionFacade extends AbstractFacade<Tipohabitacion> {
    @PersistenceContext(unitName = "com.mycompany_Reservas_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipohabitacionFacade() {
        super(Tipohabitacion.class);
    }
    
}
