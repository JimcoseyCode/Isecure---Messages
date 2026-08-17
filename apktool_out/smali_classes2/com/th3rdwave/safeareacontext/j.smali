.class public final synthetic Lcom/th3rdwave/safeareacontext/j;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/util/concurrent/locks/ReentrantLock;

.field public final synthetic h:Lkotlin/jvm/internal/z;

.field public final synthetic i:Ljava/util/concurrent/locks/Condition;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/z;Ljava/util/concurrent/locks/Condition;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/th3rdwave/safeareacontext/j;->g:Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/th3rdwave/safeareacontext/j;->h:Lkotlin/jvm/internal/z;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/th3rdwave/safeareacontext/j;->i:Ljava/util/concurrent/locks/Condition;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/j;->g:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/j;->h:Lkotlin/jvm/internal/z;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/th3rdwave/safeareacontext/j;->i:Ljava/util/concurrent/locks/Condition;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/th3rdwave/safeareacontext/k;->c(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/z;Ljava/util/concurrent/locks/Condition;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
