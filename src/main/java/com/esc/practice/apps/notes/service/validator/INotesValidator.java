/**
 * 
 */
package com.esc.practice.apps.notes.service.validator;

/**
 * @author ARUP
 *
 */
public interface INotesValidator<TRequest, TResponse> {

	/**
	 * This method validates the incoming request as per the business rules
	 * 
	 * @param request
	 * @return
	 */
	TResponse validateRequest(TRequest request);
}
