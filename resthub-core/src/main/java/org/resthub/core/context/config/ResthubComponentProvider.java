package org.resthub.core.context.config;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;

/**
 * This class defines and perform scanning for resources specified
 * configurations. It reads options, parameters, filters and apply them to
 * filtering
 * 
 * This class inherit {@link ClassPathBeanDefinitionScanner} to beneficiate of
 * all options and parameters handling from Spring configuration
 * 
 * @author bmeurant <Baptiste Meurant>
 * @author Loïc Frering <loic.frering@gmail.com>
 * 
 */
public abstract class ResthubComponentProvider extends ClassPathScanningCandidateComponentProvider {

	public ResthubComponentProvider(boolean useDefaultFilters) {
		super(useDefaultFilters);
	}

	/**
	 * {@InheritDoc}
	 * 
	 * Whe are no managing beans here : we deactivate initial check from
	 * inherited class by always returning true
	 */
	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		return true;
	}

}