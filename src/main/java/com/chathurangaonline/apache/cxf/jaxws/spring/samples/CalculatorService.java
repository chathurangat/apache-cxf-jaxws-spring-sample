package com.chathurangaonline.apache.cxf.jaxws.spring.samples;

import javax.jws.WebService;

/**
 * <p>
 *     SIB
 * </p>
 * @author Chathuranga Tennakoon / www.chathurangaonline.com
 */
@WebService
public interface CalculatorService {

    double multiply(double num1,double num2);
}
