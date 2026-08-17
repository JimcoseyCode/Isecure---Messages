.class public final synthetic Lexpo/modules/clipboard/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:Ljava/io/BufferedOutputStream;


# direct methods
.method public synthetic constructor <init>(Ljava/io/BufferedOutputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/clipboard/e;->g:Ljava/io/BufferedOutputStream;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/clipboard/e;->g:Ljava/io/BufferedOutputStream;

    .line 2
    .line 3
    invoke-static {v0}, Lexpo/modules/clipboard/ClipboardImageKt;->c(Ljava/io/BufferedOutputStream;)Li7/B;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
