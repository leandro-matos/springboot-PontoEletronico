
## Author

👤 **Leandro Matos**

## Endpoints da API 

### GET /api/funcionarios
Listar todos os funcionários cadastrados no sistema
```json
  {
    "id": 1,
    "nome": "Manoel da Silva",
    "cpf": "12345678911",
    "email": "manoel@manoel.com",
    "datacadastro": "2020-05-19T21:00:00"
  },
  {
    "id": 3,
    "nome": "Luana Pereira",
    "cpf": "1234111111",
    "email": "email@email.com",
    "datacadastro": "2020-06-25T22:49:06"
  },
  {
    "id": 4,
    "nome": "Carlos Santana",
    "cpf": "12345678911",
    "email": "carlos@carlos.com",
    "datacadastro": "2020-06-25T22:52:50"
  }
```
<br/>

### GET /api/funcionarios/{id}
Exibir as informações de um usuário a patir do seu identificado (id)

Ex: /api/funcionarios/2

```json
  {
    "id": 2,
    "nome": "Manoel da Silva",
    "cpf": "12345678911",
    "email": "manoel@manoel.com",
    "datacadastro": "2020-05-19T21:00:00"
  }
```
<br/>

### POST /api/funcionarios/inserir
Cadastrar um novo funcionário (os campos id e datacadastro não são obrigatórios);

***Request Body***
```json
  {
    "nome": "Maria Silva",
    "cpf": "9876342111",
    "email": "maria@maria.com"
  }
```

***Response Body***
 ```json
{
  "id": 5,
  "nome": "Maria Silva",
  "cpf": "9876342111",
  "email": "maria@maria.com",
  "datacadastro": "2020-06-25T23:52:22.242"
}
```
<br/>

### PUT /api/funcionarios/update/{id}
Atualizar o cadastro de um funcionário a partir de seu identificador

 ```json
  {
    "nome": "Maria da Silva",
    "cpf": "98763425555",
    "email": "maria@maria.com.br"
	}
```
<br/>

### GET /api/ponto/
Listar todas as batidas de ponto do sistema de todos os funcionários

```json
  {
    "id": 3,
    "idfunc": 1,
    "dataHora": "2020-06-24T10:05:00",
    "tipo": "volta almoço"
  },
  {
    "id": 4,
    "idfunc": 1,
    "dataHora": "2020-06-24T15:00:00",
    "tipo": "saída"
  }
```
<br/>

### GET /api/ponto/{id}
Listar todas as batidas de ponto de um funcionário passando como parâmetro o seu id

```json
[
  {
    "id": 1,
    "idfunc": 1,
    "dataHora": "2020-06-24T06:50:00",
    "tipo": "entrada"
  },
  {
    "id": 2,
    "idfunc": 1,
    "dataHora": "2020-06-24T09:00:00",
    "tipo": "saída almoço"
  },
  {
    "id": 3,
    "idfunc": 1,
    "dataHora": "2020-06-24T10:05:00",
    "tipo": "volta almoço"
  },
  {
    "id": 4,
    "idfunc": 1,
    "dataHora": "2020-06-24T15:00:00",
    "tipo": "saída"
  }
]
```
<br/>

### POST /api/ponto/inserir
Registrar a batida de ponto de um funcionário

```json
{
	"idfunc": 10,
	"tipo": "entrada"
}
```

***Mais detalhes dos testes podem ser consultados no Swagger: http://localhost:8080/swagger-ui.html***


## License
[MIT](https://choosealicense.com/licenses/mit/)


