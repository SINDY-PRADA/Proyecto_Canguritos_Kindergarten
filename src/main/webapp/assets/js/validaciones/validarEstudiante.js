const formulario = document.getElementById('formulario');
const inputs = document.querySelectorAll('#formulario input');

const expresiones = {

	nombreEstudiante: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	apellidoEstudiante: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	tipoDocumento: /^[a-zA-ZÀ-ÿ\s]{2}$/, // Letras y espacios, pueden llevar acentos.
	documentoEstudiante: /^\d{6,10}$/, // 7 a 14 numeros.
	rhEstudiante: /^.{2,3}$/, // 4 a 12 digitos.
	ciudadNacimiento: /^[a-zA-ZÀ-ÿ\s]{5,10}$/, // Letras y espacios, pueden llevar acentos.
	sexoEstudiante: /^[a-zA-ZÀ-ÿ\s]{1}$/, // Letras y espacios, pueden llevar acentos.
}

const campos = {

	nombreEstudiante: false,
	apellidoEstudiante: false,
	tipoDocumento: false,
	documentoEstudiante: false,
	rhEstudiante: false,
	ciudadNacimiento: false,
	sexoEstudiante: false,
}

const validarFormulario = (e) => {
	switch (e.target.name) {

		case "nombreEstudiante":
			validarCampo(expresiones.nombreEstudiante, e.target, 'nombreEstudiante');
		break;
		case "apellidoEstudiante":
			validarCampo(expresiones.apellidoEstudiante, e.target, 'apellidoEstudiante');

		break;
		case "tipoDocumento":
			validarCampo(expresiones.tipoDocumento, e.target, 'tipoDocumento');

		break;
		case "documentoEstudiante":
			validarCampo(expresiones.documentoEstudiante, e.target, 'documentoEstudiante');

		break;
		case "rhEstudiante":
			validarCampo(expresiones.rhEstudiante, e.target, 'rhEstudiante');

		break;
		case "ciudadNacimiento":
			validarCampo(expresiones.ciudadNacimiento, e.target, 'ciudadNacimiento');

		break;
		case "sexoEstudiante":
			validarCampo(expresiones.sexoEstudiante, e.target, 'sexoEstudiante');
		break;
	}
}

const validarCampo = (expresion, input, campo) => {
	if(expresion.test(input.value)){
		document.getElementById(`grupo__${campo}`).classList.remove('formulario__grupo-incorrecto');
		document.getElementById(`grupo__${campo}`).classList.add('formulario__grupo-correcto');
		document.querySelector(`#grupo__${campo} i`).classList.add('fa-check-circle');
		document.querySelector(`#grupo__${campo} i`).classList.remove('fa-times-circle');
		document.querySelector(`#grupo__${campo} .formulario__input-error`).classList.remove('formulario__input-error-activo');
		campos[campo] = true;
	} else {
		document.getElementById(`grupo__${campo}`).classList.add('formulario__grupo-incorrecto');
		document.getElementById(`grupo__${campo}`).classList.remove('formulario__grupo-correcto');
		document.querySelector(`#grupo__${campo} i`).classList.add('fa-times-circle');
		document.querySelector(`#grupo__${campo} i`).classList.remove('fa-check-circle');
		document.querySelector(`#grupo__${campo} .formulario__input-error`).classList.add('formulario__input-error-activo');
		campos[campo] = false;
	}
}


inputs.forEach((input) => {
	input.addEventListener('keyup', validarFormulario);
	input.addEventListener('blur', validarFormulario);
});

formulario.addEventListener('submit#1', (e) => {
	e.preventDefault();

	const terminos = document.getElementById('terminos');
	if(campos.nombreEstudiante  && campos.apellidoEstudiante  && campos.tipoDocumento  && campos.documentoEstudiante && campos.rhEstudiante && campos.ciudadNacimiento && campos.sexoEstudiante){
		;

		document.getElementById('formulario__mensaje-exito').classList.add('formulario__mensaje-exito-activo');
		setTimeout(() => {
			document.getElementById('formulario__mensaje-exito').classList.remove('formulario__mensaje-exito-activo');
		}, 5000);

		document.querySelectorAll('.formulario__grupo-correcto').forEach((icono) => {
			icono.classList.remove('formulario__grupo-correcto');
		});
	} else {
		document.getElementById('formulario__mensaje').classList.add('formulario__mensaje-activo');
	}
});