.class public final synthetic Lr/v;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:LF/r;

.field public final synthetic h:I

.field public final synthetic i:LF/t;


# direct methods
.method public synthetic constructor <init>(LF/r;ILF/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/v;->g:LF/r;

    .line 5
    .line 6
    iput p2, p0, Lr/v;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lr/v;->i:LF/t;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr/v;->g:LF/r;

    .line 2
    .line 3
    iget v1, p0, Lr/v;->h:I

    .line 4
    .line 5
    iget-object v2, p0, Lr/v;->i:LF/t;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lr/y$a;->e(LF/r;ILF/t;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
