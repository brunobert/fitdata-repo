use fitdata;

-- install

SET FOREIGN_KEY_CHECKS = 0;

-- deletes
delete from parametros where idEmpresa = 1;
delete from parametrosAcesso where idEmpresa = 1;
delete from depto where idEmpresa = 1;
delete from auxiliar where idEmpresa = 1;
delete from sistema  where idEmpresa = 1;
delete from tipoauxiliar where idEmpresa = 1;
delete from licenca where idEmpresa = 1;
delete from perfilfuncao where idEmpresa = 1;
delete from perfil where idEmpresa = 1;
delete from funcao where idEmpresa = 1;
delete from empresa where idEmpresa = 1;
delete from usuariosistema where idEmpresa = 1;
delete from usuarioperfil where idEmpresa = 1;
delete from usuariodetalhe where idEmpresa = 1 ;
delete from usuario where idEmpresa  = 1;



-- empresa
insert into empresa (idEmpresa,numeroDocumento,razaoSocial,dataLogUpdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,8836020000109,'VERA Contabilidade',now(),'sys',now(),'sys');

-- licenca
insert into licenca (idLicenca,idEmpresa,numeroLicenca,dataLogUpdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,1,'000001',now(),'sys',now(),'sys');

-- tipoAuxiliar
insert into tipoAuxiliar (idEmpresa,idTipo,descricaoTipo,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,1,'Cargo',now(),'sys',now(),'sys');

-- sistema
insert into sistema (idEmpresa,idSistema,nomeSistema,descricaoSistema,siglaSistema,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,1,'Contábil','Módulo Contabilidade','CT',now(),'sys',now(),'sys');

-- perfil
insert into perfil (idEmpresa,idPerfil,idSistema,nomePerfil,descricaoPerfil,flagSistema,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,1,1,'Administrador','Acesso a todas as funções do sistema','S',now(),'sys',now(),'sys');

-- funcao
insert into funcao (idEmpresa,idFuncao,idSistema,nomeFuncao,descricaoFuncao,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,1,1,'ROLE_EMPRESA','Cadastro de Empresas',now(),'sys',now(),'sys');
insert into funcao (idEmpresa,idFuncao,idSistema,nomeFuncao,descricaoFuncao,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,2,1,'ROLE_PERFIL','Cadastro de Perfis de Acesso',now(),'sys',now(),'sys');
insert into funcao (idEmpresa,idFuncao,idSistema,nomeFuncao,descricaoFuncao,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,3,1,'ROLE_USUARIO','Cadastro de Usuários',now(),'sys',now(),'sys');
insert into funcao (idEmpresa,idFuncao,idSistema,nomeFuncao,descricaoFuncao,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,4,1,'ROLE_DEPTO','Cadastro de Deptos',now(),'sys',now(),'sys');
insert into funcao (idEmpresa,idFuncao,idSistema,nomeFuncao,descricaoFuncao,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,5,1,'ROLE_CLIENTE','Cadastro de Clientes',now(),'sys',now(),'sys');

-- usuario
insert into usuario (idUsuario,idEmpresa,senhaUsuario,nomeCompleto,dataCriacao,flagSistema,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values ('sys',1,md5('abc@123'),'Administrador',now(),'S',now(),'sys',now(),'sys');

-- usuario x sistema
insert into usuariosistema (idUsuario,idEmpresa,idSistema,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values ('sys',1,1,now(),'sys',now(),'sys');

-- usuario x perfil
insert into usuarioperfil (idUsuario,idEmpresa,idPerfil,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values ('sys',1,1,now(),'sys',now(),'sys');

-- usuario x detalhe
insert into usuariodetalhe (idUsuario,idEmpresa,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values ('sys',1,now(),'sys',now(),'sys');

-- parametrosAcesso
insert into parametrosAcesso (idEmpresa,idParam,descParam,valorparam,tipoParam,flagSistema,valorPadrao,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,'EXPW','Quantidade máxima de meses para expiração de senha','12','N','N','12',now(),'sys',now(),'sys');
insert into parametrosAcesso (idEmpresa,idParam,descParam,valorparam,tipoParam,flagSistema,valorPadrao,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,'PWINI','Senha padrão inicial',md5('abc@123'),'N','N',md5('abc@123'),now(),'sys',now(),'sys');
insert into parametrosAcesso (idEmpresa,idParam,descParam,valorparam,tipoParam,flagSistema,valorPadrao,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,'PWSTD','Indica se o sistema deve ou não validar regras para senhas','S','N','N','S',now(),'sys',now(),'sys');
insert into parametrosAcesso (idEmpresa,idParam,descParam,valorparam,tipoParam,flagSistema,valorPadrao,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,'TRYBL','Número de Tentativas de Acesso antes de bloquear usuário','5','N','N','5',now(),'sys',now(),'sys');
insert into parametrosAcesso (idEmpresa,idParam,descParam,valorparam,tipoParam,flagSistema,valorPadrao,dataLogupdate,usuarioLogUpdate,dataLogInclusao,usuarioLogInclusao) values (1,'MINBL','Tempo em Minutos que usuário permanece bloqueado após N tentativas de acesso','30','N','N','30',now(),'sys',now(),'sys');



-- parametros Gerais 

SET FOREIGN_KEY_CHECKS = 1;
