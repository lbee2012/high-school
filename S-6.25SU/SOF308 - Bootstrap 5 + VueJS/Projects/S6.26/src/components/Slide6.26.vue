<script setup>
import { ref } from 'vue'

// Danh sách sinh viên
const students = ref([
  { name: 'Trần Quang Anh', age: 18 },
  { name: 'Lê Thị Lan', age: 19 },
  { name: 'Phạm Văn Bảo', age: 18 }
])

// Biến lưu thông tin sinh viên mới hoặc đang sửa
const newStudent = ref({ name: '', age: null })
const isEditing = ref(false)
const editIndex = ref(null)

// Hàm thêm hoặc cập nhật sinh viên
const handleSubmit = () => {
  if (newStudent.value.name && newStudent.value.age > 0) {
    if (isEditing.value) {
      // Cập nhật sinh viên
      students.value[editIndex.value] = { ...newStudent.value }
      isEditing.value = false
      editIndex.value = null
    } else {
      // Thêm mới
      students.value.push({ ...newStudent.value })
    }
    // Reset form
    newStudent.value.name = ''
    newStudent.value.age = null
  }
}

// Sửa sinh viên
const editStudent = (index) => {
  newStudent.value = { ...students.value[index] }
  isEditing.value = true
  editIndex.value = index
}

// Xóa sinh viên
const deleteStudent = (index) => {
  students.value.splice(index, 1)
  // Nếu đang sửa sinh viên vừa bị xóa thì hủy sửa
  if (editIndex.value === index) {
    isEditing.value = false
    newStudent.value = { name: '', age: null }
  }
}
</script>

<template>
  <div class="container mt-5 row">
    <h2 class="mb-4">Quản lý Sinh viên</h2>

    <!-- Form thêm/sửa sinh viên -->
    <form  @submit.prevent="handleSubmit">
      <h3 class="mb-4 text-success">{{ isEditing ? 'Sửa sinh viên' : 'Thêm sinh viên' }}</h3>

      <div class="form-group">
        <label for="name">Tên sinh viên</label>
        <input type="text" v-model="newStudent.name" class="form-control" required />
      </div>

      <div class="form-group">
        <label for="age">Tuổi</label>
        <input type="number" v-model.number="newStudent.age" class="form-control" required />
      </div>

      <button type="submit" class="btn btn-primary mt-2">
        {{ isEditing ? 'Cập nhật sinh viên' : 'Thêm sinh viên' }}
      </button>
    </form>

    <!-- Danh sách sinh viên -->
    <div >
        <br>
      <h3 class="mb-4 text-danger">Danh sách sinh viên</h3>
      <ul class="list-group">
  <li
    v-for="(student, index) in students"
    :key="index"
    class="list-group-item d-flex justify-content-between align-items-center"
  >
    <div class="flex-grow-1">
      <div>{{ student.name }} - {{ student.age }} tuổi</div>
    </div>
    <div class="d-flex gap-2">
      <button class="btn btn-warning btn-sm" @click="editStudent(index)">Sửa</button>
      <button class="btn btn-danger btn-sm" @click="deleteStudent(index)">Xóa</button>
    </div>
  </li>
</ul>
      
    </div>
  </div>
</template>
<style scoped>

</style>