package com.fiap.postech.fase3.Parquimetro.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Condutor_Veiculo")
public class CondutorVeiculo {

    public CondutorVeiculo(String condutor_CPF, String placa){
        this.condutor_CPF_placa = condutor_CPF + placa;
        this.condutor_CPF = condutor_CPF;
        this.placa = placa;
    }

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String condutor_CPF_placa;
    @DynamoDBAttribute
    private String condutor_CPF;
    @DynamoDBAttribute
    private String placa;


}
