.class public final synthetic Lr/d2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:Lr/f2;

.field public final synthetic h:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lr/f2;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/d2;->g:Lr/f2;

    .line 5
    .line 6
    iput-object p2, p0, Lr/d2;->h:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr/d2;->g:Lr/f2;

    .line 2
    .line 3
    iget-object v1, p0, Lr/d2;->h:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lr/f2;->a(Lr/f2;Ljava/util/List;)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
