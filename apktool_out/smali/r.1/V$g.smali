.class final Lr/V$g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/I$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "g"
.end annotation


# instance fields
.field final synthetic a:Lr/V;


# direct methods
.method constructor <init>(Lr/V;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/V$g;->a:Lr/V;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/V$g;->a:Lr/V;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/V;->N0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/V$g;->a:Lr/V;

    .line 2
    .line 3
    invoke-static {p1}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lr/V;->G0(Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
