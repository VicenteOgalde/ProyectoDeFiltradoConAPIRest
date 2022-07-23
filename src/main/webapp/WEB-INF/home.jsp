<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prueba FullStack JAVA</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
</head>
<body>

<div class="container" style="margin-top: 30px">
		<div class="row">
			<div class="col-sm-3">
				<h2>Prueba FullStack JAVA</h2>
			</div>
		</div>
		<br>
		<div class="row">
			<form action="home" method="post">
				<div class="col-sm-3">
					<label>Region</label>
					 <select class="form-select"
						aria-label="Default select example" name="region">
						<option selected value=0>Seleccione una Region</option>
						<c:forEach items="${regiones}" var="element">
						<option value="<c:out value="${element.regionId}"/>"><c:out
									value="${element.nombre}" /></option>
						</c:forEach>
					</select> <br>
				</div>
				<br>
				<div class="col-sm-3">
					<label>Curso</label> 
					<select class="form-select"
						aria-label="Default select example" name="curso">
						<option selected value="">Seleccione un Curso</option>
						<c:forEach items="${cursos}" var="element">
							<option value="<c:out value="${element.cursoId}"/>"><c:out
									value="${element.cursoId}" /></option>
						</c:forEach>
					</select> 
					<br>
					<button type="submit" class="btn btn-primary">Buscar</button>
				</div>
			</form>

			<div class="col-sm-9">
				<div id="tabla">
					<br>
					<table class="table table-sm table-dark">
						<thead>
							<tr>
								<th scope="col">Rut</th>
								<th scope="col">Nombre</th>
								<th scope="col">Apellido Paterno</th>
								<th scope="col">Apellido Materno</th>
								<th scope="col">Codigo Curso</th>
								<th scope="col">Descripcion Curso</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${estudianteCurso}" var="element">
							<tr>
								<td><c:out value="${element.rut}"/></td>
								<td><c:out value="${element.nombre}"/></td>
								<td><c:out value="${element.apellidoPaterno}"/></td>
								<td><c:out value="${element.apellidoMaterno}"/></td>
								<td><c:out value="${element.codigoCurso}"/></td>
								<td><c:out value="${element.descripcionCurso}"/></td>
							</tr>
							</c:forEach>
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>


</body>
</html>