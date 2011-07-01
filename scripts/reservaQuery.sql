SELECT
     *,
     r.`dataDevolucao` AS r_dataDevolucao,
     r.`dataRetirada` AS r_dataRetirada,
     r.`multa` AS r_multa,
     r.`valor` AS r_valor,
     a.`nome` AS a_nome,
     a.`ano` AS a_ano,
     a.`codCategoria` AS a_codCategoria,
     a.`cor` AS a_cor,
     a.`preco` AS a_preco,
     c.`Cliente_Type` AS c_Cliente_Type,
     c.`CELULAR` AS c_CELULAR,
     c.`EMAIL` AS c_EMAIL,
     c.`NOME` AS c_NOME,
     c.`CIDADE` AS c_CIDADE
FROM
     `Reserva` r INNER JOIN `Automovel` a ON r.`automovel_id` = a.`automovel_id`
     INNER JOIN `Cliente` c ON r.`cliente_id` = c.`cliente_id`