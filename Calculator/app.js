//Selectors
	const todoInput = document.querySelector('.todo-input');
	const todoButton = document.querySelector('.todo-button');
	const todoList = document.querySelector('.todo-list');
	const filterOption = document.querySelector('.filter-todo');
	
//Event Listeners
	document.addEventListener('DOMContentLoaded',getTodos);
	todoButton.addEventListener("click",addTodo);
	todoList.addEventListener('click',deleteCheck);
	filterOption.addEventListener('click',filterTodo);
	
	
	
//Function
	function addTodo(event){
		
		event.preventDefault();
		//console.log('Hello'); 
		
		const todoDiv = document.createElement("div");
		todoDiv.classList.add("todo");	
		
		const newTodo = document.createElement("li");
		newTodo.innerText = todoInput.value;
		newTodo.classList.add('todo-item');
		todoDiv.appendChild(newTodo);
		
		//localstorage of todo
		saveLocalTodos(todoInput.value);
		
		const completedButton = document.createElement('button');
		completedButton.innerHTML = '<i class="fas fa-check"></i>';
		completedButton.classList.add("complete-btn");
		todoDiv.appendChild(completedButton);
		
		const trashButton = document.createElement('button');
		trashButton.innerHTML = '<i class="fas fa-trash"></i>';
		trashButton.classList.add("trash-btn");
		todoDiv.appendChild(trashButton);
		
		todoList.appendChild(todoDiv);
		
		todoInput.value="";
		
		
	}
	
	function deleteCheck(event){
		const item = event.target;
		
		if(item.classList[0]==='trash-btn'){
			const todo  = item.parentElement;
			todo.classList.add("fall");	
			removeLocalTodos(todo);
			todo.addEventListener('transitionend',function(){
				todo.remove();
			});
		}
		
		if(item.classList[0]==="complete-btn"){
			const todo = item.parentElement;
			todo.classList.toggle("completed");
		}
	}
	
	function filterTodo(e){
		const todos = todoList.childNodes;
		todos.forEach(function(todo){
			switch(e.target.value){
				case "all":
					todo.style.display = "flex";
					break;
					
				case "completed":
					if(todo.classList.contains('completed')){
						todo.style.display = "flex";
					}else{
						todo.style.display = "none";
					}
					break;
					
				case "uncompleted":
					if(!todo.classList.contains('completed')){
						todo.style.display = "flex";
					}else{
						todo.style.display = "none";
					}
					break;
			}
		});
		
		
	}
	
	
	function saveLocalTodos(todo){
		//check for existing todo list
		let todos;
		if(localStorage.getItem("todos")===null){
			todos=[];
		}else{
			todos = JSON.parse(localStorage.getItem('todos'));
		}
		todos.push(todo);
		localStorage.setItem("todos",JSON.stringify(todos));
		
	}
	
	function getTodos(){
		console.log("Hi");
		let todos;
		if(localStorage.getItem("todos"===null)){
			todos=[];
		}
		else {
			todos = JSON.parse(localStorage.getItem('todos'));
		}
		todos.forEach(function(todo){
			//Create each item and display
			const todoDiv = document.createElement('div');
			todoDiv.classList.add("todo");
			
			const newTodo = document.createElement('li');
			newTodo.innerText = todo;
			newTodo.classList.add("todo-item");
			todoDiv.appendChild(newTodo);
			
			const completedButton = document.createElement("button");
			completedButton.innerHTML = '<i class="fas fa-check"></i>';
			completedButton.classList.add("complete-btn");
			todoDiv.appendChild(completedButton);
			
			const trashButton = document.createElement("button");
			trashButton.innerHTML = '<i class="fas fa-trash"></i>';
			trashButton.classList.add("trash-btn");
			todoDiv.appendChild(trashButton);
			
			todoList.appendChild(todoDiv);
		});
	}
	
	function removeLocalTodos(todo){
		if(localStorage.getItem("todos")===null){
			todos=[];
		}else{
			todos= JSON.parse(localStorage.getItem("todos"));
		}
		
		//console.log(todo.children[0].innerText);
		//console.log(todos.indexOf(todo.children[0].innerText));
		todos.splice(todos.indexOf(todo.children[0].innerText),1);
		localStorage.setItem('todos',JSON.stringify(todos));
		
		
		
	}