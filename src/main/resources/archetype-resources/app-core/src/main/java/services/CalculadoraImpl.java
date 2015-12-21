#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.services;

import ${package}.IFCalculadora;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 02/12/2015, 14:41:22
 */
@Stateless
@Remote(IFCalculadora.class)
public class CalculadoraImpl implements IFCalculadora{

    @Override
    public int somar(int a, int b) {
        return a+b;
    }

}
