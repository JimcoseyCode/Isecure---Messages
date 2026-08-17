.class public final synthetic Lr/u2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lr/x2;

.field public final synthetic b:I

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lr/x2;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/u2;->a:Lr/x2;

    .line 5
    .line 6
    iput p2, p0, Lr/u2;->b:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lr/u2;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lr/u2;->a:Lr/x2;

    .line 2
    .line 3
    iget v1, p0, Lr/u2;->b:I

    .line 4
    .line 5
    iget-boolean v2, p0, Lr/u2;->c:Z

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Lr/x2;->c(Lr/x2;IZLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
