#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.cdi;

import ${package}.IFCalculadora;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 * @author Ricardo Job
 */
@ApplicationScoped
public class ProducersResource {
    
    @Produces 
    @Resource(lookup = "java:global/${rootArtifactId}-core/CalculadoraImpl")
    private IFCalculadora calculadora;

}
