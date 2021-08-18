/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Aluno
 */
public class Produto {
    
    private int idProduto;
    private String descricaoProduto;
    private int quantProduto;
    private double precoUnitProduto;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }

    public double getPrecoUnitProduto() {
        return precoUnitProduto;
    }

    public void setPrecoUnitProduto(double precoUnitProduto) {
        this.precoUnitProduto = precoUnitProduto;
    }
    
}
