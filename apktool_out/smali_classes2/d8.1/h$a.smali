.class abstract Ld8/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ld8/x$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Ld8/h;


# direct methods
.method public constructor <init>(Ld8/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld8/h$a;->a:Ld8/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Lk8/f;Lk8/b;Lk8/f;)V
    .locals 1

    .line 1
    const-string v0, "enumClassId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "enumEntryName"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lq8/k;

    .line 12
    .line 13
    invoke-direct {v0, p2, p3}, Lq8/k;-><init>(Lk8/b;Lk8/f;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Ld8/h$a;->h(Lk8/f;Lq8/g;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public c(Lk8/f;)Ld8/x$b;
    .locals 2

    .line 1
    new-instance v0, Ld8/h$a$b;

    .line 2
    .line 3
    iget-object v1, p0, Ld8/h$a;->a:Ld8/h;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p0}, Ld8/h$a$b;-><init>(Ld8/h;Lk8/f;Ld8/h$a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public d(Lk8/f;Lk8/b;)Ld8/x$a;
    .locals 4

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ld8/h$a;->a:Ld8/h;

    .line 12
    .line 13
    sget-object v2, LL7/h0;->a:LL7/h0;

    .line 14
    .line 15
    const-string v3, "NO_SOURCE"

    .line 16
    .line 17
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2, v2, v0}, Ld8/h;->x(Lk8/b;LL7/h0;Ljava/util/List;)Ld8/x$a;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ld8/h$a$a;

    .line 28
    .line 29
    invoke-direct {v1, p2, p0, p1, v0}, Ld8/h$a$a;-><init>(Ld8/x$a;Ld8/h$a;Lk8/f;Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public e(Lk8/f;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld8/h$a;->a:Ld8/h;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Ld8/h;->N(Ld8/h;Lk8/f;Ljava/lang/Object;)Lq8/g;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p0, p1, p2}, Ld8/h$a;->h(Lk8/f;Lq8/g;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Lk8/f;Lq8/f;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lq8/s;

    .line 7
    .line 8
    invoke-direct {v0, p2}, Lq8/s;-><init>(Lq8/f;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Ld8/h$a;->h(Lk8/f;Lq8/g;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public abstract g(Lk8/f;Ljava/util/ArrayList;)V
.end method

.method public abstract h(Lk8/f;Lq8/g;)V
.end method
