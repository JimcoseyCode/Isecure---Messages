.class public final Lm7/a$a;
.super Ljava/lang/Thread;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm7/a;->a(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILw7/a;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:Lw7/a;


# direct methods
.method constructor <init>(Lw7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm7/a$a;->g:Lw7/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/a$a;->g:Lw7/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
