.class public final synthetic Lm4/o;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lm4/q;

.field public final synthetic h:Lm4/t;


# direct methods
.method public synthetic constructor <init>(Lm4/q;Lm4/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm4/o;->g:Lm4/q;

    .line 5
    .line 6
    iput-object p2, p0, Lm4/o;->h:Lm4/t;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm4/o;->g:Lm4/q;

    .line 2
    .line 3
    iget-object v1, p0, Lm4/o;->h:Lm4/t;

    .line 4
    .line 5
    iget v1, v1, Lm4/t;->a:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lm4/q;->e(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
