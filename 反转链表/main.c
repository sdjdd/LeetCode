#include <stdio.h>
#include <malloc.h>

struct ListNode {
    int Val;
    struct ListNode *next;
};

// 创建链表
struct ListNode* createList(int a[], int n) {
    struct ListNode *t, *head;
    head = NULL;
    for (int i = 0; i < n; ++i) {
        if (head == NULL) {
            head = (struct ListNode*) malloc(sizeof(struct ListNode));
            head->Val = a[i];
            head->next = NULL;
            t = head;
        } else {
            t->next = (struct ListNode*) malloc(sizeof(struct ListNode));
            t = t->next;
            t->Val = a[i];
            t->next = NULL;
        }
    }
    return head;
}

// 打印链表
void printList(struct ListNode *head) {
    if (head != NULL) {
        printf("%d", head->Val);
        head = head->next;
    }
    while (head != NULL) {
        printf("->%d", head->Val);
        head = head->next;
    }
    putchar('\n');
}

// 迭代反转链表
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *next, *pre = NULL;
    while (head != NULL) {
        next = head->next;
        head->next = pre;
        pre = head;
        head = next;
    }
    return pre;
}

// 递归反转链表
struct ListNode* reverseList2(struct ListNode* head) {
    struct ListNode *last;
    if (head == NULL || head->next == NULL) {
        return head;
    }
    last = reverseList2(head->next);
    head->next->next = head;
    head->next = NULL;
    return last;
}

int main() {
    int a[] = {1, 2, 3, 4, 5};
    struct ListNode *h = createList(a, 5);
    printList(h);
    h = reverseList(h);
    printList(h);
    h = reverseList2(h);
    printList(h);

    return 0;
}
