.class public final synthetic Landroidx/camera/core/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/j;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Landroidx/camera/core/o;

.field public final synthetic d:Landroid/graphics/Matrix;

.field public final synthetic e:Landroidx/camera/core/o;

.field public final synthetic f:Landroid/graphics/Rect;

.field public final synthetic g:Landroidx/camera/core/g$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/j;Ljava/util/concurrent/Executor;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/camera/core/i;->a:Landroidx/camera/core/j;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/camera/core/i;->b:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/camera/core/i;->c:Landroidx/camera/core/o;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/camera/core/i;->d:Landroid/graphics/Matrix;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/camera/core/i;->e:Landroidx/camera/core/o;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/camera/core/i;->f:Landroid/graphics/Rect;

    .line 15
    .line 16
    iput-object p7, p0, Landroidx/camera/core/i;->g:Landroidx/camera/core/g$a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/camera/core/i;->a:Landroidx/camera/core/j;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/core/i;->b:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/camera/core/i;->c:Landroidx/camera/core/o;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/camera/core/i;->d:Landroid/graphics/Matrix;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/camera/core/i;->e:Landroidx/camera/core/o;

    .line 10
    .line 11
    iget-object v5, p0, Landroidx/camera/core/i;->f:Landroid/graphics/Rect;

    .line 12
    .line 13
    iget-object v6, p0, Landroidx/camera/core/i;->g:Landroidx/camera/core/g$a;

    .line 14
    .line 15
    move-object v7, p1

    .line 16
    invoke-static/range {v0 .. v7}, Landroidx/camera/core/j;->c(Landroidx/camera/core/j;Ljava/util/concurrent/Executor;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/g$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method
