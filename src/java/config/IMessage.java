/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author Tún ^^
 */
public interface IMessage {
    //Login

    public static final String LOGIN_FAIL = "Wrong email or password";
    public static final String LOGIN_SUCCESS = "Login successfully";

    //Register
    public static final String REGISTER_FAIL = "Email alredy exists, please use another email";
    public static final String REGISTER_SUCCESS = "Sign Up Success";

}
