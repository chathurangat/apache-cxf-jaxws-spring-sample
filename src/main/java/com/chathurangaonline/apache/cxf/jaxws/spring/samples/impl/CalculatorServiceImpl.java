package com.chathurangaonline.apache.cxf.jaxws.spring.samples.impl;

import com.chathurangaonline.apache.cxf.jaxws.spring.samples.CalculatorService;
import javax.jws.WebService;

/**
 * <p>
 *     SIB for {@link com.chathurangaonline.apache.cxf.jaxws.spring.samples.CalculatorService}
 * </p>
 * @author Chathuranga Tennakoon / www.chathurangaonline.com
 */
@WebService
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
