.class LO5/h$a;
.super LO5/h$c;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO5/h;->b(Lcom/google/gson/d;Ljava/lang/reflect/Field;Ljava/lang/String;LR5/a;ZZ)LO5/h$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Ljava/lang/reflect/Field;

.field final synthetic e:Z

.field final synthetic f:Lcom/google/gson/n;

.field final synthetic g:Lcom/google/gson/d;

.field final synthetic h:LR5/a;

.field final synthetic i:Z

.field final synthetic j:LO5/h;


# direct methods
.method constructor <init>(LO5/h;Ljava/lang/String;ZZLjava/lang/reflect/Field;ZLcom/google/gson/n;Lcom/google/gson/d;LR5/a;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LO5/h$a;->j:LO5/h;

    .line 2
    .line 3
    iput-object p5, p0, LO5/h$a;->d:Ljava/lang/reflect/Field;

    .line 4
    .line 5
    iput-boolean p6, p0, LO5/h$a;->e:Z

    .line 6
    .line 7
    iput-object p7, p0, LO5/h$a;->f:Lcom/google/gson/n;

    .line 8
    .line 9
    iput-object p8, p0, LO5/h$a;->g:Lcom/google/gson/d;

    .line 10
    .line 11
    iput-object p9, p0, LO5/h$a;->h:LR5/a;

    .line 12
    .line 13
    iput-boolean p10, p0, LO5/h$a;->i:Z

    .line 14
    .line 15
    invoke-direct {p0, p2, p3, p4}, LO5/h$c;-><init>(Ljava/lang/String;ZZ)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method a(LS5/a;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LO5/h$a;->f:Lcom/google/gson/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/gson/n;->b(LS5/a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, LO5/h$a;->i:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    :goto_0
    iget-object v0, p0, LO5/h$a;->d:Ljava/lang/reflect/Field;

    .line 16
    .line 17
    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method b(LS5/c;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, LO5/h$a;->d:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-boolean v0, p0, LO5/h$a;->e:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LO5/h$a;->f:Lcom/google/gson/n;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, LO5/k;

    .line 15
    .line 16
    iget-object v1, p0, LO5/h$a;->g:Lcom/google/gson/d;

    .line 17
    .line 18
    iget-object v2, p0, LO5/h$a;->f:Lcom/google/gson/n;

    .line 19
    .line 20
    iget-object v3, p0, LO5/h$a;->h:LR5/a;

    .line 21
    .line 22
    invoke-virtual {v3}, LR5/a;->d()Ljava/lang/reflect/Type;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v0, v1, v2, v3}, LO5/k;-><init>(Lcom/google/gson/d;Lcom/google/gson/n;Ljava/lang/reflect/Type;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/google/gson/n;->d(LS5/c;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public c(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LO5/h$c;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, LO5/h$a;->d:Ljava/lang/reflect/Field;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eq v0, p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    return v1
.end method
