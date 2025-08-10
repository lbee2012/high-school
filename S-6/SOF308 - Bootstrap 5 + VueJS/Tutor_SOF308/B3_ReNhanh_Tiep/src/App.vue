<template>
    <div>
        <h1>On tap ve Vong lap</h1>
        <table class="table container">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Ma</th>
                    <th scope="col">Ten</th>
                    <th scope="col">Chuc vu</th>
                    <th scope="col">Luong</th>
                    <th scope="col">Kinh nghiem</th>
                </tr>
            </thead>
            <tbody>
                <template v-for="(item, index) in listNhanVien" :key="item.id">
                    <tr>
                        <td>{{ index + 1 }}</td>
                        <td>{{ item.ma }}</td>
                        <td>{{ item.ten }}</td>
                        <td>{{ item.chucVu }}</td>
                        <td>{{ item.luong }}</td>
                        <td>{{ item.kinhNghiem }}</td>
                    </tr>
                </template>
            </tbody>
        </table>
    </div>

    <div class="container">
        <h1>Calculation</h1>
        <div>
            <label for="exampleFormControlInput1" class="form-label">Number 1</label>
            <input type="number" class="form-control" v-model="num1">
        </div>
        <div>
            <label for="exampleFormControlInput2" class="form-label">Number 2</label>
            <input type="number" class="form-control" v-model="num2">
        </div>
        <div>
            <button class="btn btn-outline-primary" @click="tong">+</button>
            <button class="btn btn-outline-primary" @click="hieu">-</button>
            <button class="btn btn-outline-primary" @click="tich">*</button>
            <button class="btn btn-outline-primary" @click="thuong">/</button>
        </div>
        <div>
            <h2>Result: {{ result }}</h2>
        </div>
    </div>
</template>

<script setup>
import { ref } from 'vue';
const listNhanVien = ref([
    { id: 1, ma: 'ma 1', ten: 'ten 1', chucVu: 'chucVu 1', luong: 1, kinhNghiem: 1},
    { id: 2, ma: 'ma 2', ten: 'ten 2', chucVu: 'chucVu 2', luong: 2, kinhNghiem: 2},
    { id: 3, ma: 'ma 3', ten: 'ten 3', chucVu: 'chucVu 3', luong: 3, kinhNghiem: 3},
    { id: 4, ma: 'ma 4', ten: 'ten 4', chucVu: 'chucVu 4', luong: 4, kinhNghiem: 4},
    { id: 5, ma: 'ma 5', ten: 'ten 5', chucVu: 'chucVu 5', luong: 5, kinhNghiem: 5},
    { id: 6, ma: 'ma 6', ten: 'ten 6', chucVu: 'chucVu 6', luong: 6, kinhNghiem: 6},
    { id: 7, ma: 'ma 7', ten: 'ten 7', chucVu: 'chucVu 7', luong: 7, kinhNghiem: 7},
    { id: 8, ma: 'ma 8', ten: 'ten 8', chucVu: 'chucVu 8', luong: 8, kinhNghiem: 8},
    { id: 9, ma: 'ma 9', ten: 'ten 9', chucVu: 'chucVu 9', luong: 9, kinhNghiem: 9},
    { id: 10, ma: 'ma 10', ten: 'ten 10', chucVu: 'chucVu 10', luong: 10, kinhNghiem: 10},
    { id: 11, ma: 'ma 11', ten: 'ten 11', chucVu: 'chucVu 11', luong: 11, kinhNghiem: 11},
    { id: 12, ma: 'ma 12', ten: 'ten 12', chucVu: 'chucVu 12', luong: 12, kinhNghiem: 12},
    { id: 13, ma: 'ma 13', ten: 'ten 13', chucVu: 'chucVu 13', luong: 13, kinhNghiem: 13},
    { id: 14, ma: 'ma 14', ten: 'ten 14', chucVu: 'chucVu 14', luong: 14, kinhNghiem: 14},
    { id: 15, ma: 'ma 15', ten: 'ten 15', chucVu: 'chucVu 15', luong: 15, kinhNghiem: 15},
    { id: 16, ma: 'ma 16', ten: 'ten 16', chucVu: 'chucVu 16', luong: 16, kinhNghiem: 16},
    { id: 17, ma: 'ma 17', ten: 'ten 17', chucVu: 'chucVu 17', luong: 17, kinhNghiem: 17},
    { id: 18, ma: 'ma 18', ten: 'ten 18', chucVu: 'chucVu 18', luong: 18, kinhNghiem: 18},
    { id: 19, ma: 'ma 19', ten: 'ten 19', chucVu: 'chucVu 19', luong: 19, kinhNghiem: 19},
    { id: 20, ma: 'ma 20', ten: 'ten 20', chucVu: 'chucVu 20', luong: 20, kinhNghiem: 20},
])

const num1 = ref(0);
const num2 = ref(0);
const result = ref(0);

function tong() {
    result.value = Number(num1.value) + Number(num2.value);
}

function hieu() {
    result.value = Number(num1.value) - Number(num2.value);
}

function tich() {
    result.value = Number(num1.value) * Number(num2.value);
}

function thuong() {
    result.value = Number(num1.value) / Number(num2.value);
}
</script>

<style scoped>
h1 {
    text-align: center;
}
button {
    margin: 10px;
}
</style>