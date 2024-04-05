package org.vinnivso.reflections.anotacao.cadastro.anotacao;

import java.lang.annotation.*;

/**
 *
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
