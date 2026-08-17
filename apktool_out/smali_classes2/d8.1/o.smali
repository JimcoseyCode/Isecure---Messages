.class public final Ld8/o;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly8/j;


# instance fields
.field private final a:Ld8/v;

.field private final b:Ld8/n;


# direct methods
.method public constructor <init>(Ld8/v;Ld8/n;)V
    .locals 1

    .line 1
    const-string v0, "kotlinClassFinder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "deserializedDescriptorResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ld8/o;->a:Ld8/v;

    .line 15
    .line 16
    iput-object p2, p0, Ld8/o;->b:Ld8/n;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Lk8/b;)Ly8/i;
    .locals 2

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld8/o;->a:Ld8/v;

    .line 7
    .line 8
    iget-object v1, p0, Ld8/o;->b:Ld8/n;

    .line 9
    .line 10
    invoke-virtual {v1}, Ld8/n;->f()Ly8/n;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ly8/n;->g()Ly8/o;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, LM8/c;->a(Ly8/o;)Lj8/e;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, p1, v1}, Ld8/w;->b(Ld8/v;Lk8/b;Lj8/e;)Ld8/x;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-interface {v0}, Ld8/x;->c()Lk8/b;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Ld8/o;->b:Ld8/n;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ld8/n;->l(Ld8/x;)Ly8/i;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method
