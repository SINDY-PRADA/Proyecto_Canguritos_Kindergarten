const formulario = document.getElementById('formulario');
const inputs = document.querySelectorAll('#formulario input');

const expresiones = {

	parentescoAcudiente: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	nombreAcudiente: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	apellidoAcudiente: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	documentoAcudiente: /^\d{6,10}$/, // 7 a 14 numeros.
	profesionAcudiente:  /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	telefonoAcudiente: /^\d{7,10}$/, // 7 a 14 numeros.
	correoAcudiente: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
	
}

const campos = {

	parentescoAcudiente: false,
	nombreAcudiente: false,
	apellidoAcudiente: false,
	documentoAcudiente: false,
	profesionAcudiente: false,
	telefonoAcudiente: false,
	correoAcudiente: false,
	txtContra: false,
}

const validarFormulario = (e) => {
	switch (e.target.name) {

		case "parentescoAcudiente":
			validarCampo(expresiones.parentescoAcudiente, e.target, 'parentescoAcudiente');
		break;
		case "nombreAcudiente":
			validarCampo(expresiones.nombreAcudiente, e.target, 'nombreAcudiente');

		break;
		case "apellidoAcudiente":
			validarCampo(expresiones.apellidoAcudiente, e.target, 'apellidoAcudiente');

		break;
		case "documentoAcudiente":
			validarCampo(expresiones.documentoAcudiente, e.target, 'documentoAcudiente');

		break;
		case "profesionAcudiente":
			validarCampo(expresiones.profesionAcudiente, e.target, 'profesionAcudiente');

		break;
		case "telefonoAcudiente":
			validarCampo(expresiones.telefonoAcudiente, e.target, 'telefonoAcudiente');

		break;
		case "correoAcudiente":
			validarCampo(expresiones.correoAcudiente, e.target, 'correoAcudiente');
		break;

		break;
		case "txtContra":
			validarCampo(expresiones.txtContra, e.target, 'txtContra');
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
	if(campos.parentescoAcudiente  && campos.nombreAcudiente  && campos.apellidoAcudiente  && campos.documentoAcudiente && campos.profesionAcudiente && campos.telefonoAcudiente && campos.correoAcudiente){
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