<template>
    <header>
        <HeaderLayout />
    </header>
    <main class="container">
        <FormSachComponent v-model:b="newObject" />
        <button class="btn btn-outline-success" @click="add()" v-if="isUpdate === -1">Add</button>
        <button class="btn btn-outline-primary" @click="update()" v-if="isUpdate !== -1">Update</button>
        <table class="table container">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Ten</th>
                    <th>Loai</th>
                    <th>Tac Gia</th>
                    <th>Gia</th>
                    <th>Hanh dong</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <template v-for="(item, i) in sachList" :key="item.id">
                        <tr>
                            <td>{{ item.id }}</td>
                            <td>{{ item.ten }}</td>
                            <td>{{ item.loai }}</td>
                            <td>{{ item.tac_gia }}</td>
                            <td>{{ item.gia }}</td>
                            <td>
                                <button class="btn btn-outline-danger" @click="remove(i)">Remove</button>
                                <button class="btn btn-outline-warning" @click="detail(item)">Detail</button>
                            </td>
                        </tr>
                    </template>
                </tr>
            </tbody>
        </table>
    </main>
    <footer>
        <FooterLayout />
    </footer>
</template>

<script setup>
import HeaderLayout from '@/layout/HeaderLayout.vue'
import FooterLayout from '@/layout/FooterLayout.vue'
import FormSachComponent from '@/components/FormSachComponent.vue'

import { ref } from 'vue';
const newObject = ref({
    ten: '',
    loai: '',
    tac_gia: '',
    gia: 0,
})
const isUpdate = ref(1) // isUpdate khac -1 => Update con = -1 => Add
const sachList = ref([
  { ten: 'ten 1', loai: 'loai 1', tac_gia: 'tac_gia 1', gia: 82, id: '1' },
  { ten: 'ten 2', loai: 'loai 2', tac_gia: 'tac_gia 2', gia: 70, id: '2' },
  { ten: 'ten 3', loai: 'loai 3', tac_gia: 'tac_gia 3', gia: 94, id: '3' },
  { ten: 'ten 4', loai: 'loai 1', tac_gia: 'tac_gia 4', gia: 94, id: '4' },
  { ten: 'ten 4', loai: 'loai 1', tac_gia: 'tac_gia 4', gia: 94, id: '4' },
  { ten: 'ten 5', loai: 'loai 1', tac_gia: 'tac_gia 5', gia: 11, id: '5' },
  { ten: 'ten 6', loai: 'loai 2', tac_gia: 'tac_gia 6', gia: 36, id: '6' },
])
function remove(i) {
    sachList.value.splice(i, 1);
};
function detail(item) {
    newObject.value = { ...item };
    isUpdate.value = sachList.value.findIndex((b) => b.id === item.id);
};
function reset() {
    newObject.value = {
        ten: '',
        loai: '',
        tac_gia: '',
        gia: 0,
    };
};
function add() {
    sachList.value.push({
        id: sachList.value.length + 1,
        ...newObject.value,
    });
    reset();
};
function update() {
    sachList.value[isUpdate.value] = {
        ...newObject.value
    };
    reset();
    isUpdate.value = -1;
}
</script>

<style scoped>

</style>