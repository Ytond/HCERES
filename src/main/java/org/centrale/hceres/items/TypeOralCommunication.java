/* --------------------------------------------------------------------------------
 * Projet HCERES
 * 
 * Gestion de données pour l'HCERES
 * 
 * Ecole Centrale Nantes - laboratoire CRTI
 * Avril 2021
 * L LETERTRE, S LIMOUX, JY MARTIN
 * -------------------------------------------------------------------------------- */
package org.centrale.hceres.items;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author kwyhr
 */
@Entity
@Table(name = "type_oral_communication")
@NamedQueries({
    @NamedQuery(name = "TypeOralCommunication.findAll", query = "SELECT t FROM TypeOralCommunication t"),
    @NamedQuery(name = "TypeOralCommunication.findByTypeOralCommunicationId", query = "SELECT t FROM TypeOralCommunication t WHERE t.typeOralCommunicationId = :typeOralCommunicationId"),
    @NamedQuery(name = "TypeOralCommunication.findByTypeOralCommunicationName", query = "SELECT t FROM TypeOralCommunication t WHERE t.typeOralCommunicationName = :typeOralCommunicationName")})
public class TypeOralCommunication implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "type_oral_communication_id")
    private Integer typeOralCommunicationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "type_oral_communication_name")
    private String typeOralCommunicationName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeOralCommunicationId")
    private Collection<OralCommunication> oralCommunicationCollection;

    /**
     *
     */
    public TypeOralCommunication() {
    }

    /**
     *
     * @param typeOralCommunicationId
     */
    public TypeOralCommunication(Integer typeOralCommunicationId) {
        this.typeOralCommunicationId = typeOralCommunicationId;
    }

    /**
     *
     * @param typeOralCommunicationId
     * @param typeOralCommunicationName
     */
    public TypeOralCommunication(Integer typeOralCommunicationId, String typeOralCommunicationName) {
        this.typeOralCommunicationId = typeOralCommunicationId;
        this.typeOralCommunicationName = typeOralCommunicationName;
    }

    /**
     *
     * @return
     */
    public Integer getTypeOralCommunicationId() {
        return typeOralCommunicationId;
    }

    /**
     *
     * @param typeOralCommunicationId
     */
    public void setTypeOralCommunicationId(Integer typeOralCommunicationId) {
        this.typeOralCommunicationId = typeOralCommunicationId;
    }

    /**
     *
     * @return
     */
    public String getTypeOralCommunicationName() {
        return typeOralCommunicationName;
    }

    /**
     *
     * @param typeOralCommunicationName
     */
    public void setTypeOralCommunicationName(String typeOralCommunicationName) {
        this.typeOralCommunicationName = typeOralCommunicationName;
    }

    /**
     *
     * @return
     */
    public Collection<OralCommunication> getOralCommunicationCollection() {
        return oralCommunicationCollection;
    }

    /**
     *
     * @param oralCommunicationCollection
     */
    public void setOralCommunicationCollection(Collection<OralCommunication> oralCommunicationCollection) {
        this.oralCommunicationCollection = oralCommunicationCollection;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typeOralCommunicationId != null ? typeOralCommunicationId.hashCode() : 0);
        return hash;
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeOralCommunication)) {
            return false;
        }
        TypeOralCommunication other = (TypeOralCommunication) object;
        if ((this.typeOralCommunicationId == null && other.typeOralCommunicationId != null) || (this.typeOralCommunicationId != null && !this.typeOralCommunicationId.equals(other.typeOralCommunicationId))) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "org.centrale.hceres.items.TypeOralCommunication[ typeOralCommunicationId=" + typeOralCommunicationId + " ]";
    }
    
}
