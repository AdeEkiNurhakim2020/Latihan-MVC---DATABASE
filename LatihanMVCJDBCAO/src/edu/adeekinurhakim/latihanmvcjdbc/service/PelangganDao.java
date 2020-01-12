/*NIM  : 10119702
 /NAMA : ADE EKI NURHAKIM
 /KELAS: IF2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.adeekinurhakim.latihanmvcjdbc.service;

import edu.adeekinurhakim.latihanmvcjdbc.entity.Pelanggan;
import edu.adeekinurhakim.latihanmvcjdbc.error.PelangganException;
import java.util.List;
/**
 *
 * @author Ade Eki Nurhakim
 */

public interface PelangganDao {

    //Untuk melakukan aktifitas CRUD
    // Get By ID dan Get By Email
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(Integer id) throws PelangganException;

    // unique
    public Pelanggan getPelanggan(String email) throws PelangganException;

    // Jika ingin meload semua data pelanggan
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
