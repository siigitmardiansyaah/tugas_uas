/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

/**
 *
 * @author
 */
public class Session {
    private static String nip;
    private static String nama;
    private static String alamat;
    private static String jenis_kelamin;
    private static String password;

    public static String getNip() {
        return nip;
    }

    public static void setNip(String nip) {
        Session.nip = nip;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Session.nama = nama;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        Session.alamat = alamat;
    }

    public static String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public static void setJenis_kelamin(String jenis_kelamin) {
        Session.jenis_kelamin = jenis_kelamin;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Session.password = password;
    }
    
    public static void resetSession() {
        nip = null;
        nama = null;
        alamat = null;
        jenis_kelamin = null;
        password = null;
    }
    
    
}
