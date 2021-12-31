/**
 * 
 */
package com.esc.practice.apps.notes.service.processor;

import com.esc.practice.apps.notes.exception.NotesException;

/**
 * @author ARUP
 *
 */
public interface INotesProcessor<TRequest, TResponse> {

	/**
	 * This method processes the incoming request as per the business rules
	 * 
	 * @param request
	 * @return
	 * @throws NotesException
	 */
	TResponse processRequest(TRequest request) throws NotesException;
}
