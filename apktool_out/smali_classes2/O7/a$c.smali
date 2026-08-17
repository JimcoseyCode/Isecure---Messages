.class LO7/a$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/a;-><init>(LB8/n;Lk8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:LO7/a;


# direct methods
.method constructor <init>(LO7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO7/a$c;->g:LO7/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()LL7/c0;
    .locals 2

    .line 1
    new-instance v0, LO7/t;

    .line 2
    .line 3
    iget-object v1, p0, LO7/a$c;->g:LO7/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LO7/t;-><init>(LL7/e;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/a$c;->a()LL7/c0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
