package com.fiap.postech.fase3.Parquimetro.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.fiap.postech.fase3.Parquimetro.model.converter.LocalDateTimeConverter;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "Condutor")
public class FormaPagamento {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    @DynamoDBAttribute
    @NotNull(message = "O atributo apelido da forma de pagamento é obrigatório!")
    private String nomeFormaPagamento;

    @DynamoDBAttribute
    private String numero_cartao;

    @DynamoDBAttribute
    private boolean flag_credito_debito;

    @DynamoDBTypeConverted( converter = LocalDateTimeConverter.class )
    @DynamoDBAttribute
    private LocalDateTime data_validade;

    @DynamoDBAttribute
    private Integer cvv;

    @DynamoDBAttribute
    public String chave_PIX;
}
