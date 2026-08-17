.class public final synthetic Lexpo/modules/camera/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LH0/a;


# instance fields
.field public final synthetic a:Lexpo/modules/camera/ExpoCameraView;

.field public final synthetic b:Lexpo/modules/kotlin/Promise;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/camera/h;->a:Lexpo/modules/camera/ExpoCameraView;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/camera/h;->b:Lexpo/modules/kotlin/Promise;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/h;->a:Lexpo/modules/camera/ExpoCameraView;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/camera/h;->b:Lexpo/modules/kotlin/Promise;

    .line 4
    .line 5
    check-cast p1, LZ/y0;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lexpo/modules/camera/ExpoCameraView;->j(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;LZ/y0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
