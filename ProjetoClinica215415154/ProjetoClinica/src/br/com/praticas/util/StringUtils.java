/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.praticas.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hugo Nathan
 */
public class StringUtils {

    public static String formatarData(Date date) {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        return format.format(date);

    }
}
