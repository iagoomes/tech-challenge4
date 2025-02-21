package br.com.fiap.postech.customermanagement.infrastructure.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CustomerEntity.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class CustomerEntity_ {

	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#zipCode
	 **/
	public static volatile SingularAttribute<CustomerEntity, String> zipCode;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#address
	 **/
	public static volatile SingularAttribute<CustomerEntity, String> address;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#city
	 **/
	public static volatile SingularAttribute<CustomerEntity, String> city;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#phone
	 **/
	public static volatile SingularAttribute<CustomerEntity, String> phone;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#name
	 **/
	public static volatile SingularAttribute<CustomerEntity, String> name;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#addressNumber
	 **/
	public static volatile SingularAttribute<CustomerEntity, String> addressNumber;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#id
	 **/
	public static volatile SingularAttribute<CustomerEntity, Long> id;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#neighborhood
	 **/
	public static volatile SingularAttribute<CustomerEntity, String> neighborhood;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#state
	 **/
	public static volatile SingularAttribute<CustomerEntity, String> state;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#complement
	 **/
	public static volatile SingularAttribute<CustomerEntity, String> complement;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity
	 **/
	public static volatile EntityType<CustomerEntity> class_;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#email
	 **/
	public static volatile SingularAttribute<CustomerEntity, String> email;
	
	/**
	 * @see br.com.fiap.postech.customermanagement.infrastructure.entity.CustomerEntity#cellPhone
	 **/
	public static volatile SingularAttribute<CustomerEntity, String> cellPhone;

	public static final String ZIP_CODE = "zipCode";
	public static final String ADDRESS = "address";
	public static final String CITY = "city";
	public static final String PHONE = "phone";
	public static final String NAME = "name";
	public static final String ADDRESS_NUMBER = "addressNumber";
	public static final String ID = "id";
	public static final String NEIGHBORHOOD = "neighborhood";
	public static final String STATE = "state";
	public static final String COMPLEMENT = "complement";
	public static final String EMAIL = "email";
	public static final String CELL_PHONE = "cellPhone";

}

