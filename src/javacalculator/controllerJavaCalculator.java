/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javacalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author admin
 */
public class controllerJavaCalculator {
    private viewJavaCalculator viewCalc;
    private modelJavaCalculator modelCalc;
    
    public controllerJavaCalculator(viewJavaCalculator viewCalc, modelJavaCalculator modelCalc){
        this.viewCalc = viewCalc;
        this.modelCalc = modelCalc;
        
        
        
        /********************** Adds action listeners ****************************/
        this.viewCalc.addbtnZeroListener(new btnZeroListener());
        this.viewCalc.addbtnOneListener(new btnOneListener());
        this.viewCalc.addbtnTwoListener(new btnTwoListener());
        this.viewCalc.addbtnThreeListener(new btnThreeListener());
        this.viewCalc.addbtnFourListener(new btnFourListener());
        this.viewCalc.addbtnFiveListener(new btnFiveListener());
        this.viewCalc.addbtnSixListener(new btnSixListener());
        this.viewCalc.addbtnSevenListener(new btnSevenListener());
        this.viewCalc.addbtnEightListener(new btnEightListener());
        this.viewCalc.addbtnNineListener(new btnNineListener());
        this.viewCalc.addbtnAddListener(new btnAddListener());
        this.viewCalc.addbtnSubtractListener(new btnSubtractListener());
        this.viewCalc.addbtnMultiplyListener(new btnMultiplyListener());
        this.viewCalc.addbtnDivideListener(new btnDivideListener());
        this.viewCalc.addbtnEqualsListener(new btnEqualsListener());
        
        
        
    }
    
    /****************** tells which view methods to preform when button is clicked ********************************/
    
    class btnZeroListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setZero();
            
        }
    }
    class btnOneListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setOne();
        }
    }
    class btnTwoListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setTwo();
        }
    }    
        class btnThreeListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setThree();
        }
    }
        class btnFourListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setFour();
        }
    }
        class btnFiveListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setFive();
        }
    }
        class btnSixListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setSix();
        }
    }
        class btnSevenListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setSeven();
        }
    }
        class btnEightListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setEight();
        }
    }
        class btnNineListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setNine();
        }
    }
        class btnAddListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setAdd();
        }
    }
        class btnSubtractListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setSubtract();
        }
    }
        class btnMultiplyListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setMultiply();
        }
    }
        class btnDivideListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            viewCalc.setDivide();    
        }
    }
        
        
        // gets the equation from the view's textfield and send it to the model
        class btnEqualsListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            
            
            String equation;
            equation = viewCalc.getEquation();
            equation = modelCalc.Calculate(equation);
            viewCalc.setEquation(equation);
            
        }
    }
    
    
}
