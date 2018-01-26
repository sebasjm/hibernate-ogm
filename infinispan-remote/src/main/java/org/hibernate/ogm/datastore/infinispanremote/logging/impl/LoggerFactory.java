/*
 * Hibernate OGM, Domain model persistence for NoSQL datastores
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.ogm.datastore.infinispanremote.logging.impl;

import java.lang.invoke.MethodHandles.Lookup;

import org.jboss.logging.Logger;

/**
 * Factory for obtaining {@link Logger} instances.
 *
 * @author Davide D'Alto
 */
public class LoggerFactory {

	private LoggerFactory() {
		// not allowed
	}

	public static Log make(Lookup creationContext) {
		return make( Log.class, creationContext );
	}

	public static <T> T make(Class<T> logClass, Lookup creationContext) {
		final String className = creationContext.lookupClass().getName();
		return Logger.getMessageLogger( logClass, className );
	}
}
