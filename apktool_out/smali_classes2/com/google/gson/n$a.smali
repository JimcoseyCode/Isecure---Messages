.class Lcom/google/gson/n$a;
.super Lcom/google/gson/n;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/n;->a()Lcom/google/gson/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/gson/n;


# direct methods
.method constructor <init>(Lcom/google/gson/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/gson/n$a;->a:Lcom/google/gson/n;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/gson/n;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(LS5/a;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, LS5/a;->D0()LS5/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LS5/b;->o:LS5/b;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, LS5/a;->u0()V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/gson/n$a;->a:Lcom/google/gson/n;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/google/gson/n;->b(LS5/a;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public d(LS5/c;Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, LS5/c;->X()LS5/c;

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/google/gson/n$a;->a:Lcom/google/gson/n;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lcom/google/gson/n;->d(LS5/c;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
