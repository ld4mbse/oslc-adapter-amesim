

package edu.gatech.mbse.oslc.wink.clients;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.eclipse.lyo.oslc4j.core.model.OslcConstants;

/**
 * Indicate which RDF: collection type should be used for representing
 * in RDF the multi-valued property
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OslcRdfCollectionType
{
    /**
     * Namespace URI.
     */
    String namespaceURI() default OslcConstants.RDF_NAMESPACE;

    /**
     * Prefix for the namespace.
     */
    String collectionType() default "List";
}
