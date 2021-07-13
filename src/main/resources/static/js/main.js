function addToBasket(id) {
	$.ajax({
		url: '/panier/add/' + id,
		type: "get",
		success: function (data) {
			swal({
				title: "Article ajouté",
				text: "You clicked the button!",
				icon: "success",
			});
		}
	})
}

function deleteBasket() {
	$.ajax({
		url:'/panier/delete',
		type:"post",
		success(data){
			var modalToggle = document.getElementById('staticBackdrop') // relatedTarget
			modalToggle.hide();
			swal({
				title: "Article supprime",
				text: "You clicked the button!",
				icon: "success",
			});
		},
		error(data){
			swal({
				title: "Article non non supprime",
				text: "You clicked the button!",
				icon: "danger",
			});
		}

	})
}